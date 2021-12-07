package ru.job4j.streamAPI.adressesList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        List<Address> addresses =  profiles.stream().map(
                Profile::getAddress).collect(Collectors.toList());
        System.out.println(addresses);
        return addresses;
    }

    public void sorted(Comparator<Address> addresses) {
        List<Address> addressList = new ArrayList<>();
        addressList.stream().distinct();
    }
}
