package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {


    @Test
    public void testBasket(){
        Basket basket = new Basket(10);
        Assertions.assertEquals(10, basket.capacity);
    }

    @Test
    public void testAddBagel() {
        Basket basket = new Basket(10);
        Item item = new Item("BGLO",0.49, "Bagel", Item.BagelVariant.ONION);
        basket.addBagel(item);
        Assertions.assertTrue(basket.getListOfBasket().contains(item), "The bagel should be in the basket");

    }

    @Test
    public void testRemoveBagel() {
        Basket basket = new Basket(10);
        Item item1 = new Item("BGLO",0.49, "Bagel", Item.BagelVariant.ONION);
        Item item2 = new Item("BGLO",0.49, "Bagel", Item.BagelVariant.EVERYTHING);
        Item item3 = new Item("BGLO",0.49, "Bagel", Item.BagelVariant.EVERYTHING);
        basket.addBagel(item1);
        basket.addBagel(item2);
        basket.addBagel(item3);
        basket.removeBagel(item1);
        Assertions.assertEquals(2,basket.getListOfBasket().size());

    }

    @Test
    public void testRemoveBagelIfNotExist() {
        Basket basket = new Basket(10);
        Item item1 = new Item("BGLO",0.49, "Bagel", Item.BagelVariant.ONION);
        Item item2 = new Item("BGLO",0.49, "Bagel", Item.BagelVariant.EVERYTHING);
        Item item3 = new Item("BGLO",0.49, "Bagel", Item.BagelVariant.EVERYTHING);
        basket.addBagel(item1);
        basket.addBagel(item2);
        String result1= basket.removeBagel(item3);
        Assertions.assertEquals(result1,"The bagel do not exist in the basket");

    }

    @Test
    public void isFull() {
        Basket basket = new Basket(2);
        Item item1 = new Item("BGLO",0.49, "Bagel", Item.BagelVariant.ONION);
        Item item2 = new Item("BGLO",0.49, "Bagel", Item.BagelVariant.EVERYTHING);
        Item item3 = new Item("BGLO",0.49, "Bagel", Item.BagelVariant.PLAIN);
        basket.addBagel(item1);
        basket.addBagel(item2);
        basket.addBagel(item3);
        Assertions.assertEquals(2,basket.getListOfBasket().size());


    }

    @Test
    public void testGetTotalCost() {
        Basket basket = new Basket(2);
        Item item1 = new Item("BGLO",0.49, "Bagel", Item.BagelVariant.ONION);
        Item item2 = new Item("BGLO",0.49, "Bagel", Item.BagelVariant.EVERYTHING);
        basket.addBagel(item1);
        basket.addBagel(item2);

    }



}
