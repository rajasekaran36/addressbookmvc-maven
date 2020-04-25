
package com.kgisl.raja.dao;

import com.kgisl.raja.models.Person;
import com.kgisl.raja.views.NameListPanel;
import com.kgisl.raja.views.DetailViewPanel;

/**
 *
 * @author Bharathy Annamalai  KGiSL
 */
import javax.swing.DefaultListModel;
public interface AddressBookDAO {
    
    public void addPerson(Person person);
    public void removePerson(String name);
    public void updatePerson(Person person,String name);
    public DefaultListModel getAllNames(NameListPanel namepanel);
    public void getSelectedName(DetailViewPanel detailPanel,String selectedName);
    
}
