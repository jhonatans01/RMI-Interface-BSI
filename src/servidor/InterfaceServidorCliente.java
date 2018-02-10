package servidor;

import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jhonatan
 */
public interface InterfaceServidorCliente extends Remote {

    public ImageIcon[] carregarFotos() throws RemoteException;

    public ImageIcon[] carregarFotosSemConf() throws RemoteException;

    public String obterPath() throws RemoteException;

    public File[] obterFiles() throws RemoteException;

    public boolean deletarFoto(int op, File file) throws RemoteException;

}
