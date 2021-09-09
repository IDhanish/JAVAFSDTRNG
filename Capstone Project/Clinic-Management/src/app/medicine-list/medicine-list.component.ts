import { Component, OnInit } from '@angular/core';
import { Medicine } from '../medicine';
import { Observable } from 'rxjs';
import { MedicineService } from '../medicine.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-medicine-list',
  templateUrl: './medicine-list.component.html',
  styleUrls: ['./medicine-list.component.css']
})
export class MedicineListComponent implements OnInit {
  medicines: Observable<Medicine[]> | undefined;


  constructor(private medicineService: MedicineService,
    private router: Router) { }

  ngOnInit() {
    this.reloadData();
  }
    reloadData() {
      this.medicines = this.medicineService.getMedicinesList();

  }

  deleteMedicine(id: number) {
    this.medicineService.deleteMedicine(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  medicineDetails(id: number){
    this.router.navigate(['details1', id]);
  }

  updateMedicine(id: number){
    this.router.navigate(['update1', id]);
  }
}