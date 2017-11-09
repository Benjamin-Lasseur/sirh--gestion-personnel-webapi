package dev.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import dev.init.Initialiseur;

@Component
public class DemarrageContextListener {
	@Autowired
	Initialiseur initialiserDonnees;

	@EventListener({ ContextRefreshedEvent.class })
	void contextRefreshedEvent() {
		initialiserDonnees.init();
	}
}
