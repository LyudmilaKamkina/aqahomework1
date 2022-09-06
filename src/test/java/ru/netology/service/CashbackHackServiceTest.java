package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

   @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        Assert.assertEquals(actual, 1000);
    }

    @Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(100);
        Assert.assertEquals(actual, 900);
    }

    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        Assert.assertEquals(actual, 0);
    }
}
