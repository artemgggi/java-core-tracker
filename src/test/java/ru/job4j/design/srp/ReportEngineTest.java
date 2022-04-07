package ru.job4j.design.srp;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ReportEngineTest {

    @Test
    public void whenOldGenerated() throws IOException {
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee worker = new Employee("Ivan", now, now, 100);
        store.add(worker);
        Report engine = new ReportEngine(store);
        StringBuilder expect = new StringBuilder()
                .append("Name; Salary;")
                .append(System.lineSeparator())
                .append(worker.getName()).append(";")
                .append(worker.getSalary()).append(";")
                .append(System.lineSeparator());
        assertThat(engine.generate(), is(expect.toString()));
    }

    @Test
    public void whenSorted() {
        MemStore store = new MemStore();
        Calendar now = Calendar.getInstance();
        Employee worker = new Employee("Ivan", now, now, 100);
        Employee secondWorker = new Employee("Max", now, now, 120);
        List<Employee> employees = new ArrayList<>();
        employees.add(worker);
        employees.add(secondWorker);
        Collections.sort(employees);
        for (Employee e : employees) {
            System.out.println(e.getName());
        }
    }

    @Test
    public void whenHTMLcreated() throws IOException {
        MemStore store = new MemStore();
        Report engine = new ReportEngine(store);
        String expected = "Html file created";
        String result = engine.generate();
        Assert.assertEquals(expected,is(result));
    }
}