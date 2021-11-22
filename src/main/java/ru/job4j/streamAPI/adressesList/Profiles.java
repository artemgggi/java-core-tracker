package ru.job4j.streamAPI.adressesList;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        List<Address> addresses =  profiles.stream().map(
                Profile::getAddress).collect(Collectors.toList());
        return addresses;
    }
}
