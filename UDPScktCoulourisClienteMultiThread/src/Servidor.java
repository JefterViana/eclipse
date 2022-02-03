/*
 * Servidor.java
 *
 * Created on 17 de Maio de 2006, 11:27
 *
 * Servidor ECHO: fica em aguardo de solicitação de algum cliente. Quando recebe
 * simplesmente devolve a mensagem.
 */

import java.net.*;
import java.io.*;

public class Servidor {
   public static void main(String args[]) {
        DatagramSocket s = null;
        try {
            s = new DatagramSocket(6788); // cria um socket UDP
            byte[] buffer = new byte[1000];
            String gabarito[] = {"1;5;VVFFV",
            		"2;5;VFFVV",
            		"3;5;VVFVV",
            		"4;5;FVVVF",
            		"5;5;VVFFV"};
            
            while (true) {
                 System.out.println("*** Servidor aguardando request");
                // cria datagrama para recepcionar solicitação do cliente
                DatagramPacket req = new DatagramPacket(buffer, buffer.length);
                s.receive(req);
                System.out.println("*** Request recebido de: " + req.getSocketAddress());
                // envia resposta
                System.out.println("*** RESPOSTA: " + new String(req.getData(), 0, req.getLength()));
                String questoes =  new String(req.getData(), 0, req.getLength());
                int numero_de_Questoes_Corretas = 0;
                int numero_de_Questoes_Erradas = 0;
                for(int q=0; q <5;q++) {
                	if(gabarito[q].equals(questoes)){
                		
                		numero_de_Questoes_Corretas ++;
                	}else {
                		numero_de_Questoes_Erradas ++;
                	}
                }
                System.out.println("*** Questões corretas: " + numero_de_Questoes_Corretas);
                System.out.println("*** Questões erradas: " + numero_de_Questoes_Erradas);
                DatagramPacket resp = new DatagramPacket(req.getData(), req.getLength(),
                        req.getAddress(), req.getPort());
                s.send(resp);
            }
            
        } catch (SocketException e) {
            System.out.println("Erro de socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro envio/recepcao pacote: " + e.getMessage());         
        } finally {
            if (s != null) s.close();
        }     
    }
}
