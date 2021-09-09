import { Component, OnInit } from '@angular/core';
import { Medicine } from '../medicine';
import { ActivatedRoute, Router } from '@angular/router';
import { MedicineService } from '../medicine.service';

@Component({
  selector: 'app-update-medicine',
  templateUrl: './update-medicine.component.html',
  styleUrls: ['./update-medicine.component.css']
})
export class UpdateMedicineComponent implements OnInit {

  id!: number;
  medicine!: Medicine;

  constructor(private route: ActivatedRoute,private router: Router,
    private medicineService: MedicineService) { }

  ngOnInit() {

   // this.medicine = new this.medicine();

    this.id = this.route.snapshot.params['id'];
    
    this.medicineService.getMedicine(this.id)
      .subscribe((data: any) => {
        console.log(data)
        this.medicine = data;
      }, (error: any) => console.log(error));
  }
  updateMedicine() {
    this.medicineService.updateMedicine(this.id, this.medicine)
      .subscribe((data: any) => {
        console.log(data);
        this.medicine = new Medicine();
        this.gotoList();
      }, (error: any) => console.log(error));
  }

  onSubmit() {
    this.updateMedicine();    
  }

  gotoList() {
    this.router.navigate(['/medicines']);
  }
}
