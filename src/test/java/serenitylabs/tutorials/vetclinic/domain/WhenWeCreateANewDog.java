package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WhenWeCreateANewDog {
    @Test
    public void it_should_have_a_name_large()  throws Exception{
        LocalDateTime birthDay = LocalDateTime.now();

        Dog fido = DogBreeder.aLargeDog()
                      .called("Fido")
                      .ofColour("black")
                      .withFavouriteFood("pizza")
                      .bornOn(birthDay);



        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Labrador",fido.getBreed());
        Assert.assertEquals("pizza",fido.getFavouriteFood());
        Assert.assertEquals(birthDay,fido.getDateOfBirth());
        Assert.assertEquals("black",fido.getColour());

    }


    @Test
    public void it_should_have_a_name_small()  throws Exception{
        LocalDateTime birthDay = LocalDateTime.now();

        Dog fido = DogBreeder.aSmallDog()
                .called("Spot")
                .ofColour("black")
                .withFavouriteFood("pizza")
                .bornOn(birthDay);



        Assert.assertEquals("Spot",fido.getName());
        Assert.assertEquals("Poodle",fido.getBreed());
        Assert.assertEquals("pizza",fido.getFavouriteFood());
        Assert.assertEquals(birthDay,fido.getDateOfBirth());
        Assert.assertEquals("black",fido.getColour());

    }
}
