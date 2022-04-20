import { Component, OnInit } from '@angular/core';
import { IplstatService } from '../iplstat/service/iplstat.service';
import { Player } from '../model/player.model';
import { TeamDetails } from '../model/team.model';

@Component({
  selector: 'app-team-stat',
  templateUrl: './team-stat.component.html',
  styleUrls: ['./team-stat.component.css']
})
export class TeamStatComponent implements OnInit {

  teams:TeamDetails[] = [];
  players:Player[] = [];
  constructor(private iplstatService:IplstatService) { }

  ngOnInit(): void {

      this.getTeamDetails();

  }

  getTeamDetails(){
      this.iplstatService.getTeamDetails().subscribe(data=>{
          this.teams = data;
      })
  }

  showTeamDetails(name:string){
      if(name !== ""){
        this.iplstatService.getPlayerDetails(name).subscribe(data=>{
          this.players = data;
      })
      }
  }
}
