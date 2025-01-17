package org.ies.employees;

import java.util.Objects;

public class Programmer extends Employee {
    private String nif;
    private String name;
    private String surname;
    private int hoursWorked;
    private String programmingLanguage;
    private String project;

    public Programmer(String nif, String name, String surname, int hoursWorked, String nif1, String name1, String surname1, int hoursWorked1, String programmingLanguage, String project) {
        super(nif, name, surname, hoursWorked);
        this.nif = nif1;
        this.name = name1;
        this.surname = surname1;
        this.hoursWorked = hoursWorked1;
        this.programmingLanguage = programmingLanguage;
        this.project = project;
    }

    @Override
    public String getNif() {
        return nif;
    }

    @Override
    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return hoursWorked == that.hoursWorked && Objects.equals(nif, that.nif) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(programmingLanguage, that.programmingLanguage) && Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nif, name, surname, hoursWorked, programmingLanguage, project);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "project='" + project + '\'' +
                ", nif='" + nif + '\'' +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", surname='" + surname + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
