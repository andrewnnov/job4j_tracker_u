package ru.job4j.map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestAddMethodFalse() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizenFalse = new Citizen("2f44a", "Arsen Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        boolean result = office.add(citizenFalse);
        assertThat(result).isFalse();
    }
}