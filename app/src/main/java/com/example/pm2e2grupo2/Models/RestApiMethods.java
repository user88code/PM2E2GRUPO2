package com.example.pm2e2grupo2.Models;

public class RestApiMethods {

    private static final String ipaddress = "bluer-twos.000webhostapp.com";
    public static final String StringHttp = "https://";
    //EndPoint Urls
    private static final String GetEmple = "/API-Examen/listacontactos.php";
    private static final String GetBuscar = "/API-Examen/listasinglecontacto.php?nombre=";
    private static final String setUpdate = "/API-Examen/actualizarcontahp";
    private static final String CreateUsuario = "/API-Examen/crearcontacto.php";

    //metodo get
    public static final String EndPointGetContact = StringHttp + ipaddress + GetEmple;
    public static final String EndPointGetBuscarContact = StringHttp + ipaddress + GetBuscar;
    public static final String EndPointSetUpdateContact = StringHttp + ipaddress + setUpdate;
    public static final String EndPointCreateUsuario = StringHttp + ipaddress + CreateUsuario;

}
