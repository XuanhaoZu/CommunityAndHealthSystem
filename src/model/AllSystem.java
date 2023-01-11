/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import jdk.jshell.execution.Util;

/**
 *
 * @author evelynzu
 */
public class AllSystem {
    
    

    public static Person person1 = new Person("lucy","lucy","patient","lucy","2000-10-23");
    public static Person person2 = new Person("judy","judy","patient","judy","1988-1-1");
    public static Person person3 = new Person("doctor1","doctor1","doctor","doctor1","1970-11-30");
    public static Person person4 = new Person("doctor2","doctor2","doctor","doctor2","1982-11-30");
    public static Person person5 = new Person("ca1","ca1","communityAdmin","communityAdmin1","1994-1-1");
    public static ArrayList<Person> persons = new ArrayList<Person>(Arrays.asList(person1,person2,person3,person4, person5));
    public static PersonDirectory personDirectory = new PersonDirectory(persons);
    
    
    public static Date date1 = new GregorianCalendar(2022, Calendar.FEBRUARY, 11,10,00).getTime();
    public static Date date2 = new GregorianCalendar(2022, Calendar.MARCH, 12,11,00).getTime();
    public static VitalSigns vitalSigns1= new VitalSigns("80/120", "72");
    public static VitalSigns vitalSigns2= new VitalSigns("68/119", "65");
    public static Encounter encounter1 = new Encounter(date1, "sleep well", vitalSigns1);
    public static Encounter encounter2 = new Encounter(date2, "Eat more", vitalSigns2);
    public static ArrayList<Encounter> encounters = new ArrayList<Encounter>(Arrays.asList(encounter1,encounter2));
    public static EncounterDirectory encounterDirectory1 = new EncounterDirectory(encounters);
    public static EncounterDirectory encounterDirectory2 = new EncounterDirectory();
            
    public static Patient patient1 = new Patient(person1, encounterDirectory1);
    public static Patient patient2 = new Patient(person2, encounterDirectory2);
    public static ArrayList<Patient> patients = new ArrayList<Patient>(Arrays.asList(patient1,patient2));
    public static PatientDirectory patientDirectory = new PatientDirectory(patients);
    
    
    public static Doctor doctor1 = new Doctor(person3);
    public static Doctor doctor2 = new Doctor(person4);
    public static ArrayList<Doctor> doctors = new ArrayList<Doctor>(Arrays.asList(doctor1,doctor2));
    public static DoctorDirectory doctorDirectory1 = new DoctorDirectory(doctors);
    public static DoctorDirectory doctorDirectory2 = new DoctorDirectory();
    public static Hospital hospital1 = new Hospital("hospital1",doctorDirectory1);
    public static Hospital hospital2 = new Hospital("hospital2",doctorDirectory2);
    public static ArrayList<Hospital> hospitals = new ArrayList<Hospital>(Arrays.asList(hospital1, hospital2));
    public static HospitalDirectory hospitalDirectory1 = new HospitalDirectory(hospitals);
    
    
    
    public static Appointment appointment1= new Appointment(date1, doctor1, patient1, false);
    public static Appointment appointment2= new Appointment(date2, doctor1, patient2, false);
    public static ArrayList<Appointment> appointments = new ArrayList<Appointment>(Arrays.asList(appointment1, appointment2));
   

    public static ArrayList<Person> house1Persons = new ArrayList<Person>(Arrays.asList(person1,person2));
    public static House house1 = new House("houseAdddress1", "owner1", house1Persons);
    public static ArrayList<House> houses = new ArrayList<>(Arrays.asList(house1));
    public static Community community1 = new Community("roxyberry crossing", 02120, hospitalDirectory1, houses);
    public static Community community2 = new Community("allston", 02134, null, null);

    
//    public static User doctorUser = new User("doctor", "doctor","doctor");
//    public static User patientUser = new User("patient", "patient","patient");
//    public static User commnityAdminUser = new User("communityAdmin", "communityAdmin","communityAdmin");
//    public static User systemAdminUser = new User("systemAdmin", "systemAdmin","systemAdmin");
//    public static ArrayList<User> users= new ArrayList<>(Arrays.asList(doctorUser, patientUser,commnityAdminUser,systemAdminUser));
    
    
    public static ArrayList<Community> communities = new ArrayList<Community>(Arrays.asList(community1,community2));
    public static City boston = new City("boston", communities);
    public static ArrayList<City> cities = new ArrayList<City>(Arrays.asList(boston));
    
    public static CommunityAdmin communityAdmin1 = new CommunityAdmin(person5,community1);
    public static ArrayList<CommunityAdmin> communityAdmins = new ArrayList<CommunityAdmin>(Arrays.asList(communityAdmin1));
    
    
    
    
 
    
}
