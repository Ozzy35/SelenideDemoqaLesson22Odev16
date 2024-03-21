package tests;

import org.testng.annotations.Test;

public class AddAndEditTest extends BaseTest {

    @Test
    public void addAndRecordTest() {
        pageManager.addAndEditPage.openWebTables();
        pageManager.addAndEditPage.testAddAndRecordInWebTable(
                "Ozge",
                "Sargin",
                "ozge.sargin@gmail.com",
                "33",
                "10000000",
                "IT");
    }

    @Test
    public void addAndEditRecordTest() {
        pageManager.addAndEditPage.openWebTables();
        pageManager.addAndEditPage.testAddAndEditRecordInWebTable(
                "Ozge",
                "Sargin",
                "ozge.sargin@gmail.com",
                "33",
                "10000000",
                "IT",
                "1200000000");
    }
}