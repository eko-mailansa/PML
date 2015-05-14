
package com.itb.ac.id.pml.session;

import javax.ejb.Remote;

/**
 *
 * @author sendy
 */
@Remote
public interface SekolahEJBRemote {

     public java.util.List<com.itb.ac.id.pml.entities.UserLogin> tampilUsers();
}
