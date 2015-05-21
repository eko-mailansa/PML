/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group3.com.pmlwebclientapps.pmlBean;

import group3.com.pmlwebclientapps.clientService.FakultasJerseyClient;
import group3.com.pmlwebclientapps.entity.Fakultas;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ws.rs.core.GenericType;
import org.glassfish.jersey.client.ClientResponse;

/**
 *
 * @author Home
 */
@Named(value = "fakultasManagedBean")
@SessionScoped
public class FakultasManagedBean implements Serializable {

    FakultasJerseyClient fakultasWSClient = new FakultasJerseyClient();
    ClientResponse clientRespon = fakultasWSClient.findAll_XML(ClientResponse.class);

//    GenericType<List<Fakultas>> genType = new GenericType<List<Fakultas>>() {
//    };
    private List<Fakultas> data;

    /**
     * Creates a new instance of FakultasManagedBean
     */
    public FakultasManagedBean() {
    }

    public List<Fakultas> getData() {
        data = (List<Fakultas>) (clientRespon.getEntity());
        return data;
    }

}
