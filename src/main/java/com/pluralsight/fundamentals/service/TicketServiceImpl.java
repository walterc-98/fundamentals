package com.pluralsight.fundamentals.service;

import com.pluralsight.fundamentals.entity.Ticket;
import com.pluralsight.fundamentals.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TicketServiceImpl implements TicketService{
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Iterable<Ticket> listTickets() {
        return ticketRepository.findAll();
    }
}
