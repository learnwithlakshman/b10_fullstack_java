import { Component, OnInit } from '@angular/core';
import { GoogleChartInterface, GoogleChartType } from 'ng2-google-charts';
import { TeamAmount } from '../model/teamamount.model';
import { IplstatService } from './service/iplstat.service';

@Component({
  selector: 'app-iplstat',
  templateUrl: './iplstat.component.html',
  styleUrls: ['./iplstat.component.css']
})
export class IplstatComponent implements OnInit {

  
  constructor() { }

  ngOnInit(): void {
  }
  

}
