import { Component } from '@angular/core';
import { ConsignmentService } from '../consignment.service';
import { ConsignmentModel } from '../consignmentModel';

@Component({
  selector: 'app-consignment',
  templateUrl: './consignment.component.html',
  styleUrls: ['./consignment.component.css']
})
export class ConsignmentComponent {

  consign:ConsignmentModel[] = [];
constructor(private consignService:ConsignmentService){

}
ngOnInit(){
  this.consignService.getConsignment().subscribe(data=>{
    console.log(data);
    this.consign = data;
  })
}
}
