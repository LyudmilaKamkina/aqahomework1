package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        Assert.assertEquals(1000, actual);
    }

    @Test
    public void remain1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(100);
        Assert.assertEquals(900, actual);
    }

    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        Assert.assertEquals(0, actual);
    }
}