package ru.job4j.design.srp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReportEngine implements Report {

    private final Store store;

    public ReportEngine(Store store) {
        this.store = store;
    }

//    @Override
//    public String generate(Predicate<Employee> filter) {
//        StringBuilder text = new StringBuilder();
//        text.append("Name; Salary");
//        for (Employee employee : store.findBy(filter)) {
//            text.append(employee.getName()).append(";")
//                    .append(employee.getSalary()).append(";")
//                    .append(System.lineSeparator());
//        }
//        return text.toString();
//    }

    @Override
    public String generate() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>List of Employees");
        sb.append("</title>");
        sb.append("</head>");
        sb.append("<body>");
        //sb.append(String.format("<b>%s is ",store.findBy()))
        sb.append("</body>");
        sb.append("</html>");
        FileWriter fStream = new FileWriter("MyHtml.html");
        BufferedWriter out = new BufferedWriter(fStream);
        out.write(sb.toString());
        out.close();
        return "Html file created";
    }
}
