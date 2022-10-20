package ru.netology.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {

    @Test
    void filterOut() {
        Filter filter = new Filter(10);
        List<Integer> list = List.of(5,25,5,34,2,5,7,15,1);
        List<Integer> listFilter = List.of(25,34,15);
        Assertions.assertEquals(listFilter, filter.filterOut(list));
    }
}