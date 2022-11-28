package com.example.myproyectofinal.Json;


import androidx.appcompat.app.AppCompatActivity;

import com.example.myproyectofinal.Encriptación.Des;
import com.google.gson.Gson;

public class Json extends AppCompatActivity{

    public static String crearJson(String Name , String userName , String Mail , int Age , int Number , boolean Gender , boolean Type , String Password ) {
        Info datos = new Info();
        Gson gson = new Gson();
        Des myDes = new Des();

        datos.setName(Name);
        datos.setUserName(userName);
        datos.setMail(Mail);
        datos.setAge(Age);
        datos.setNumber(Number);
        datos.setGender(Gender);
        datos.setType(Type);
        datos.setPassword(Password);

        String nuevojson = myDes.cifrar(gson.toJson(datos));

        return nuevojson;
    }

    public static Info leerJson(String textoJson){
        Gson gson = new Gson();
        Des myDes = new Des();
        Info datos = gson.fromJson(myDes.desCifrar(textoJson), Info.class);

        return datos;
    }

    public static String crearJsonCuenta(String Name , String Password , int Image) {
        Cuenta datos = new Cuenta();
        Gson gson = new Gson();
        Des myDes = new Des();

        datos.setNameCuenta(Name);
        datos.setPassCuenta(Password);
        datos.setImage(Image);

        String nuevojson = myDes.cifrar(gson.toJson(datos));

        return nuevojson;
    }

    public static Cuenta leerJsonCuenta(String textoJson){
        Gson gson = new Gson();
        Des myDes = new Des();
        Cuenta datos = gson.fromJson(myDes.desCifrar(textoJson), Cuenta.class);

        return datos;
    }

    public static String crearJsonCorreo(String Mail , String HTML) {
        Correo datos = new Correo();
        Gson gson = new Gson();

        datos.setMailCorreo(Mail);
        datos.setHTMLCorreo(HTML);

        String nuevojson = gson.toJson(datos);

        return nuevojson;
    }
}
