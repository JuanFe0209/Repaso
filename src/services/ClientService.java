package services;

import domain.enums.ClientType;
import domain.mapping.dtos.ClientDto;
import domain.models.Client;

import java.util.List;

public interface ClientService {
    ClientDto createClient(ClientDto client);
    ClientDto updateClient(ClientDto client);
    String removeClient(String clientId);
    List<ClientDto> listAllClient();
    List<ClientDto> listAllByType(ClientType type);
}

