package org.ies.employees;

public class TechnologyDirector extends Employee{

    public TechnologyDirector(String nif, String name, String surname, int hoursWorked) {
        super(nif, name, surname, hoursWorked);
    }

    @Override
    public void showInfo() {
        System.out.println("NIF: " + nif + " Nombre: " + name + " Apellidos: " + surname + " Horas trabajadas: " + hoursWorked);

    }

    @Override
    public String toString() {
        return "TechnologyDirector{" +
                "name='" + name + '\'' +
                ", nif='" + nif + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", surname='" + surname + '\'' +
                '}';
    }
}
