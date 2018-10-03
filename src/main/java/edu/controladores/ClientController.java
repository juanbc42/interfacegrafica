package edu.controladores;
//importacao de pacotes do spring

import edu.modeloDAO.ClienteDAO;
import edu.modeloDAO.FuncionarioDAO;
import edu.modelodedados.Cliente;
import edu.modelodedados.Funcionarios;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientController {
    
//mapping para novocliente
   
 @RequestMapping(value="/novocliente",method =RequestMethod.GET) //porque esse é get? 
    public String novoClient(Model model){ 
        
       List<String> profissoes = new ArrayList<String>();
        profissoes.add("Administrador");
        profissoes.add("Médico");
        profissoes.add("Professor");
        profissoes.add("Jogador de Futebol");
        profissoes.add("Dev Master");
        profissoes.add("Scrum Master");
        profissoes.add("Stagg");
        
        model.addAttribute("profissoes", profissoes);        
        model.addAttribute("cliente", new Cliente());
    return "novocliente";
  }
    
    
//Mappings para método salvar
@RequestMapping(value="/salvarCliente",method=RequestMethod.POST)// e esse é post? 
public String salvarC(@ModelAttribute Cliente cliente, Model model) throws SQLException{
cliente.informacoesCliente();


ClienteDAO.adicionarCliente(cliente);
model.addAttribute("cliente",new Cliente());
return "novocliente";
}
//Mapping para clientes
@RequestMapping (value="/clientes",method=RequestMethod.GET)
public String clientes (Model model) throws SQLException{
    model.addAttribute ("clientes", ClienteDAO.buscarClientes());
return "clientes";
}

@RequestMapping(value="/novofuncionario",method=RequestMethod.GET) //porque esse é get? 
    public String novoFuncionario(Model model){ 
        
       List<String> cargos = new ArrayList<String>();
        cargos.add("Gerente");
        cargos.add("Supervisor");
        cargos.add("Gerente Financeiro");
        cargos.add("Leader Técnico");
        cargos.add("Leader Gerencial");
        cargos.add("Técnico");
       model.addAttribute("cargos", cargos);        
       model.addAttribute("funcionario", new Funcionarios());
    return "novofuncionario";
  }
//Mappings para Salvar Funcionario
@RequestMapping(value="/salvarFuncionario",method=RequestMethod.POST)// e esse é post? 
public String salvarF(@ModelAttribute Funcionarios funcionario, Model model) throws SQLException{
funcionario.informacoesFuncionario();

FuncionarioDAO.adicionarFuncionarios(funcionario);
model.addAttribute("funcionario",new Funcionarios());
return "novofuncionario";
}


@RequestMapping (value="/funcionarios",method=RequestMethod.GET)
public String funcionarios (Model model) throws SQLException{
    model.addAttribute ("funcionarios", FuncionarioDAO.buscarFunc());
return "funcionarios";
}
}