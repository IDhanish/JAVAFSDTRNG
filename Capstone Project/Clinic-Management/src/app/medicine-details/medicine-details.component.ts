import { Component, OnInit } from '@angular/core';
import { Medicine } from '../medicine';
import { ActivatedRoute, Router } from '@angular/router';
import { MedicineService } from '../medicine.service';

@Component({
  selector: 'app-medicine-details',
  templateUrl: './medicine-details.component.html',
  styleUrls: ['./medicine-details.component.css']
})
export class MedicineDetailsComponent implements OnInit {
  id!: number;
  medicine: Medicine | undefined ;

  constructor(private route: ActivatedRoute,private router: Router,
    private medicineService: MedicineService) { }

  ngOnInit() {
    this.medicine = new Medicine();

    this.id = this.route.snapshot.params['id'];
    
    this.medicineService.getMedicine(this.id)
      .subscribe((data: Medicine | undefined) => {
        console.log(data)
        this.medicine = data;
      }, (error: any) => console.log(error));
  }

  list(){
    this.router.navigate(['medicines']);
  }
}
