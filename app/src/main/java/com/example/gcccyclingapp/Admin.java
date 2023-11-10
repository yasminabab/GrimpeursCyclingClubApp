package com.example.gcccyclingapp;

import android.content.Context;
import android.media.metrics.Event;

public class Admin extends Account {
    DBAdmin dbAdmin;
    DBClubs dbClubs;

    public Admin(Context context) {
        super("admin", "admin", "Admin");
        dbAdmin = new DBAdmin(context);
        dbClubs = new DBClubs(context);
    }

    public void createClub(Club club){
        dbAdmin.insertClub(club.getClubName(), club.username, club.password);
        dbClubs.createTable(club.getClubName());
    }
    public void createParticipant(Participant participant){
        dbAdmin.insertParticipant(participant.name, participant.username, participant.password);
//        dbClubs.createTable(club.getClubName());
    }

    public void deleteClub(DBAdmin dbAdmin, DBClubs dbClubs, Club club){
//        dbClubs.deleteTable(club.getClubName());
        dbAdmin.deleteClub(club.getClubName());
    }

    public void createEvent(EventType eventType){
        dbAdmin.insertEvent(eventType.getName(), eventType.getAge(), eventType.getPace(), eventType.getLevel(), eventType.getLocation(), eventType.getTime(), eventType.getDetails());
    }
    public void deleteEvent(EventType eventType){
        dbAdmin.deleteEvent(eventType.getName());
    }
    public void updateEvent(EventType eventType, String category, String info){
        dbAdmin.updateEvent(eventType.getName(), category, info);
    }

    public void addParticipant(Club club, Participant participant){ // add a participant to a club, will have to change for future use
        dbClubs.addParticipant(club.getClubName(), participant.name, participant.username, participant.password); // delete participant from a club table
    }
//    public void deleteParticipant(DBClubs dbClubs, Club club, Participant participant){
//        dbClubs.deleteParticipant(club.getClubName(), participant.name); // delete participant from a club table
//    }



}
