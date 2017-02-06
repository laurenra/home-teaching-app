package org.ldr.ht.samples;

import java.util.ArrayList;
import java.util.List;

import org.ldr.ht.model.Address;
import org.ldr.ht.model.Email;
import org.ldr.ht.model.Person;
import org.ldr.ht.model.Phone;

/**
 * Created by laurenra on 2/4/17.
 */
public class SamplePerson {

    public Person makePerson1() {
        Person person = new Person();

        person.setFamilyName("Smith");
        person.setGivenName("William");
        person.setPreferredName("Bill");

        List<Phone> phones = new ArrayList<Phone>();
        Phone phoneMobile = new Phone();
        phoneMobile.setType("mobile");
        phoneMobile.setNumber("8015551002");
        phones.add(phoneMobile);
        Phone phoneHome = new Phone();
        phoneHome.setType("home");
        phoneHome.setNumber("8015551001");
        phones.add(phoneHome);
        person.setPhone(phones);

        List<Email> emails = new ArrayList<Email>();
        Email emailPersonal = new Email();
        emailPersonal.setType("personal");
        emailPersonal.setAddress("whsmith@mymail.com");
        emails.add(emailPersonal);
        person.setEmail(emails);

        List<Address> addresses = new ArrayList<Address>();
        Address homeAddress = new Address();
        homeAddress.setType("home");
        homeAddress.setHouseNumber("4320");
        homeAddress.setStreet("Happy Street");
        homeAddress.setCity("Springfield");
        homeAddress.setState("Ohio");
        addresses.add(homeAddress);
        person.setAddress(addresses);

        return person;
    }
}
