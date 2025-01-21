package org.ies.employees;

import java.util.Arrays;
import java.util.Objects;

public class ProjectManagers extends Employee{
    private String[] projects;

    public ProjectManagers(String nif, String name, String surname, int hoursWorked, String[] projects) {
        super(nif, name, surname, hoursWorked);
        this.projects = projects;
    }

    @Override
    public void showInfo() {
        System.out.println("NIF: " + nif + " Nombre: " + name + " Apellidos: " + surname + " Horas trabajadas: " + hoursWorked + " Número de proyectos: ");
        for (String project : projects){
                showInfo();
        }
    }

    public boolean hasProject(String project){
        for (var p : projects){
            if (p.equals(project)){
                return true;
            }
        }
        return false;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProjectManagers that = (ProjectManagers) o;
        return Objects.deepEquals(projects, that.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(projects));
    }

    @Override
    public String toString() {
        return "ProjectManagers{" +
                "projects=" + Arrays.toString(projects) +
                ", nif='" + nif + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
