/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebapps.webservice;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Home
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(group3.com.pmlwebapps.webservice.DosenFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.FakultasFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.JadwalFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.KelasFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.LogFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.MahasiswaFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.MataKuliahFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.PendaftaranDetailFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.PendaftaranFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.ProgramStudiFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.RuangFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.SemesterFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.SettingFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.StatusBayarFacadeREST.class);
        resources.add(group3.com.pmlwebapps.webservice.UserLoginFacadeREST.class);
    }
    
}
