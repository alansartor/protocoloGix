package ar.com.gix.gixServer.endPoint.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EndPoints para la version 2, sobre-escribir solo los endpoints que cambian
 * @author alansartor18@hotmail.com
 *
 */
@RestController
@RequestMapping(value = "/api/v2.0")
public class EndPointController2 extends EndPointController1{

}
