package br.com.serasa.experian.api.anotacao.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.serasa.experian.api.anotacao.domain.Greeting;

@RestController
@RequestMapping("/api")
public class NotacaoApiController {
	
	 private static final String template = "Hello, %s!";
	 private final AtomicLong counter = new AtomicLong();
	
	 @RequestMapping("/teste")
	  public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		  return new Greeting(counter.incrementAndGet(),
                  String.format(template, name));
	 }
	 
	 @RequestMapping(value = "/protesto", method= RequestMethod.POST)
	 public String consultarProtestos() {
		 return "ConsultarProtestosResponse";
	 }
	 
	 @RequestMapping(value = "/acaojudicial" , method= RequestMethod.POST )
	 public String consultarAcaoJudicial() {
		 return "ConsultarAcaoJudicialResponse";
	 }
	 
	 @RequestMapping(value = "/pefin" , method= RequestMethod.POST )
	 public String consultarPefin() {
		 return "ConsultarPefinResponse";
	 }
	 
	 @RequestMapping(value = "/refin" , method= RequestMethod.POST)
	 public String consultarRefin() {
		 return "ConsultarRefinResponse";
	 }
	 
	 @RequestMapping(value = "/dividasvencidas" , method= RequestMethod.POST)
	 public String consultarDividasVencidas() {
		 return "ConsultarDividasVencidasResponse";
	 }
	 
	 @RequestMapping(value = "/participacaofalencia" , method= RequestMethod.POST)
	 public String consultarParticipacaoFalencias() {
		 return "ConsultarParticipacaoFalenciasResponse";
	 }
	 
	 @RequestMapping(value = "/chequesemfundo" , method= RequestMethod.POST)
	 public String consultarChequeSemFundoAchei() {
		 return "ConsultarChequeSemFundoAcheiResponse";
	 }
	 
	 @RequestMapping(value = "/chequesemfundccf" , method= RequestMethod.POST)
	 public String consultarChequeSemFundoCCF() {
		 return "ConsultarChequeSemFundoCCFResponse";
	 }
	 
	
	 
	 
	 
	 
}
