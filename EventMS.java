import com.sun.jdi.LocalVariable;
import jdk.internal.icu.lang.UCharacterDirection;

import java.awt.event.InputEvent;
import java.util.*;


class Event{

    private int eventId;


    private String eventName;
private String i;
    private String eventDate;
    private String id;

    public Event(int eventId,String eventName, String eventDate){

        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    // Setter methods

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventDate() {
        return eventDate;
    }
// Getter methods



    public String toString(){

        return "Event ID "+this.eventId+" Event Name :"+this.eventName+" Event Date "+this.eventDate;
    }


    public String getId() {
        return getId();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String replace() {
      return null;
    }
}


public class EventMS {


    private static String remove;
    private static Iterator<Event> i;

    public static void main(String[] args) {

        Event e1 = new Event(1, "Birthday Event", "10.03.2022");

        Event e2 = new Event(2, "Birthday Event", "10.03.2022");

        Event e3 = new Event(3, "Birthday Event", "10.03.2022");

 boolean found =false;
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        ArrayList<Event> events = new ArrayList<Event>();


        events.add(e1);

        events.add(e2);

        events.add(e3);


        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("1.List all the events");
        System.out.println("2.List an individual");
        System.out.println("3.Edit an event");
        System.out.println("4.Delete an event");
        System.out.println("5.List the attendees attending an event");
        System.out.println("6.Add an attendee from an event");
        System.out.println("7.Delete an attendee from an event");
        System.out.println("8.exit the app");
        System.out.println("Enter your choice");
        String choice;
        choice = s1.next();
        String choice1;

        switch (choice) {

            // Req #1
            case "1"://
                for (Event e : events) {
                    System.out.println(e);
                }
                break;

            // Req #2
            case "2"://
                System.out.print("Enter your event id");
                choice1 = s2.next();

                    switch(choice1){
                        case "1":
                            System.out.println(e1);
                            break;
                        case "2":
                            System.out.println(e2);
                            break;
                        case"3":
                            System.out.println(e3);
                         break;
                    }
//Edit an event
            case "3":
                System.out.println("list of event");
                int event = s1.nextInt();

                System.out.println("list an individual event");
                String ename = s1.nextLine();

                System.out.println("edit an event");

                System.out.println("delete an event");
                 event = s1.nextInt();


                 break;

                    case "4":
                    case "5":
                        System.out.println("Enter Attendee ID:");
                        int id = s1.nextInt();
                        System.out.println("Enter Attendee Name");
                        String name = s1.next();
                        System.out.println("Enter Attendee Age");
                        int age = s1.nextInt();
                        System.out.println("Enter Attendee E");
                        String Eventattend =s1.next();

                       //events .add(new Event(id,name,age,Eventattend));


                        break;

                    case 7:

                        boolean found = false;

                        System.out.println("Enter Attendee ID to Delete:");
                        id =s1.nextInt();
                        System.out.println("--------");


                                }
                    }


                 break;


                }





                ///////////////
                *Scanner scanner = new Scanner(/System.in);
                ///
                System.out.println("Welcome to my app, choose one option:\n1)List all the event\n2)List one event\n3)Edit event\n4)Delete event\n5)List all the attendees attending a specific event\n6)Add an attendee to an event\n7)Delete an attendee from an event\nWrite \"close\" to terminate the programme");
                System.out.println("==============");
                String inputText = scanner.nextLine().toLowerCase();
                System.out.println("==============");
                ///
                try
    private final  EventMS;

    private final Object name; *Scanner scanner = new Scanner(/System.in);

    private final class. name;

    {
                    while(!inputText.equals("close")){
                        System.out.println("1)List all the event\n2)List one event\n3)Edit event\n4)Delete event\n5)List all the attendees attending aspecific event\n6)Add an attendee to an event\n7)Delete an attendee from an event\nWrite\"close\" to terminate the programme");
                        System.out.println("----------------------------");
                        switch(inputText){

                            //List all Events
                            case "1":
                                Iterable<? extends Event> events;
                                for(Event i: events){
                                    System.out.println("Sport ID: "+i.getId() +" - "+ " Event:  "+i.replace().toUpperCase());
                                    System.out.println(i.replace());
                                }
                                break;//case1

                            //List an individual Event
                            case "2":
                                System.out.println("==============");
                                System.out.println("choose one event");
                                inputText = scanner.nextLine().toLowerCase();
                                class.try;
                                private class events;
                                Event = Event;
                                for(classid: Event){
                                    if(inputText.equals(events.())){
                                        System.out.println("Event selected:   "+ i.toString());
                                    }
                                }
                                break;//case2

                            //Edit an event
                            case "3":
                                System.out.println("What event you want to update? ");
                                inputText = scanner.nextLine().toLowerCase();
                                for(int eventlist:){
                                    if(Objects.equals(inputText, i= inputText())){
                                        System.out.println("You choose: "+i.(name)+"\nChoose the new name: ");
                                        String oldName=inputText;//store previous name;
                                        inputText = scanner.nextLine().toLowerCase();
                                        int eventlist1 = eventlist;
                                        interface eventlist1;
                                        System.out.println("Sport name updated from: "+ oldName + " to: "+ i.remove());
                                    }
                                }
                                break;//case3

                            //Delete an event
                            case "4":
                                System.out.println("==============");
                                System.out.println("choose one event to delete");
                                inputText = scanner.nextLine().toLowerCase();
                                System.out.println("==============");
                                try{
                                    for("e2,"){
                                        if(inputText.equals(i.remove())){

                                        }
                                            i.remove(i);
                                        }
                                    }
                                }catch,name{
                                    System.out.println("The error is ---> "+name);
                                }
                                break;//case4

                            //List the attendees attending an event
                            case "5":
                                System.out.println("==============");
                                System.out.println("choose one event and show the attendes");
                                inputText = scanner.nextLine().toLowerCase();
                                System.out.println("Attendee list: ");
                                for(enum att: i){
                                    for(,"e2"(){
                                        if(inputText.equals(i.remove()) ){
                                            if(scanner.hasNextBoolean()).scanner.hasNext()
                                        ).equals(i.remove()){
                                                System.out.println((remove));
                                            }
                                        }
                                    }
                                }
                                break;//case5

                            //Add an attendee to an event
                            case "6":
                                System.out.println("==============");…

                   */

                }






        }
        //req #3



        //for(Event e: events);









    /*
    public static String load(String eventid){
        this.event = eventid.findEvent(eventId);

        this.attendees = attendees.findAttendees(this.event);
        List<Attendee> ConfirmedAttendees = attendees.findConfirmedAttendees(event);
        if (ConfirmedAttendees.Event) {
            this.selectedAttendees =  Attendee(confirmed.size());
            int i = setEventName();
                    for (Attendee atd : confirmdAttendees){
                        this.selectedAttendees[i++]=atd;
                    }
        }
        this.numberPeopleAttending = attendee.findNumberPeopleAtttending(this.event);
        this.numberPeopleAttended = attendee.findNumberPeopleAttendeed(this.event);

        delete getId = Attendee;
    }confirmedMembersAttended){

    }
    public String findConfirmedAttendees(){Attendee0;();
    attendedEvent.confirmedAttendance(this.event,this.selected);
    removeSessionScope();
    return "event?faces-redirect";
    }

    */


//deletes an attendee, by ID reference from the database,chosen by user

        }


    private static void While() {
    }

    private static void While() {
    }

    private static class Events {
    }