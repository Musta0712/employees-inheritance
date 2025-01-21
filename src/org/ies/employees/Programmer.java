package org.ies.employees;

import java.util.Arrays;
import java.util.Objects;

public class Programmer extends Employee {
    private String[] programmingLanguages;
    private String project;

    public Programmer(String nif, String name, String surname, int hoursWorked, String[] programmingLanguages, String project) {
        super(nif, name, surname, hoursWorked);
        this.programmingLanguages = programmingLanguages;
        this.project = project;
    }

    @Override
    public void showInfo() {
        System.out.println("NIF: " + nif + " Nombre: " + name + " Apellidos: " + surname + " Horas trabajadas: " + hoursWorked + " Lenguages de programación: " + programmingLanguage + " Proyecto: " + project);
    }

    public boolean knowsLanguage(String languages) {
        for (var programmingLanguages : programmingLanguages){
            if (programmingLanguages.equals(languages)){
                return true;
            }
        }
        return false;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
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
        return Objects.deepEquals(programmingLanguages, that.programmingLanguages) && Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(programmingLanguages), project);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguages=" + Arrays.toString(programmingLanguages) +
                ", project='" + project + '\'' +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
