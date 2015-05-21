/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebclientapps.pmlBean;

import group3.com.pmlwebclientapps.entity.Log;
import group3.com.pmlwebclientapps.facade.LogFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Home
 */
@Named(value = "logManagedBean")
@SessionScoped
public class LogManagedBean implements Serializable {

    /**
     * Creates a new instance of LogManagedBean
     */
    @EJB
    private LogFacade logEJB;
    private List<Log> logList;
    public LogManagedBean() {
    }

    public List<Log> getLogList() {
        logList=logEJB.findLogsById(1);
        return logList;
    }
    
}
