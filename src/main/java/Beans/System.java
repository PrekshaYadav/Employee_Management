/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

/**
 *
 * @author preks
 */
public class System {
    
    private PatientDirectory patientDirector;
    private PersonDirectory personDirect;
    private DoctorDirectory doctorDirectory;
    private HospitalDirectory hospitalDirector;

    public System(PatientDirectory patientDirector, PersonDirectory personDirect, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirector) {
        this.patientDirector = patientDirector;
        this.personDirect = personDirect;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirector = hospitalDirector;
    }

    public PatientDirectory getPatientDirector() {
        return patientDirector;
    }

    public void setPatientDirector(PatientDirectory patientDirector) {
        this.patientDirector = patientDirector;
    }

    public PersonDirectory getPersonDirect() {
        return personDirect;
    }

    public void setPersonDirect(PersonDirectory personDirect) {
        this.personDirect = personDirect;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public HospitalDirectory getHospitalDirector() {
        return hospitalDirector;
    }

    public void setHospitalDirector(HospitalDirectory hospitalDirector) {
        this.hospitalDirector = hospitalDirector;
    }
    
    
}
