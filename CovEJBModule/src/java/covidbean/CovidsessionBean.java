/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package covidbean;

import javax.ejb.Stateless;

/**
 *
 * @author kantanat
 */
@Stateless
public class CovidsessionBean implements CovidsessionBeanRemote {

    @Override
    public String covid(String json) {
        return null;
    }
}
