//package ru.job4j.streamAPI.adressesList;
//
//import org.junit.Test;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//import static org.hamcrest.Matchers.is;
//import static org.junit.Assert.*;
//
//public class ProfilesTest {
//
//    @Test
//    public void whenCollected() {
//        List<Address> addresses = List.of(
//                new Address("Nizniy Novgorod", "Sovetskaya", 100, 1),
//                new Address("Moscow", "Varvarka", 20, 1),
//                new Address("Saints-Petersburg", "Novgorodskaya", 120, 5)
//        );
//        Profile sc = new Profile(address);
//        Predicate<Profile> ad = profile  -> profile.getAddress();
//        List<Address> rsl = Profiles.collect(addresses,);
//        List<Profile> expected = new ArrayList<>();
//        expected.add();
//        assertThat(rsl, is(expected));
//    }
//}