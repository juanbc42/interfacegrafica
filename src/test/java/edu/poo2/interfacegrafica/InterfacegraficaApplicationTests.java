package edu.poo2.interfacegrafica;

import edu.config.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InterfacegraficaApplicationTests {

	@Test
	public void testeConexao() throws SQLException {
            Connection con = Conexao.getConnection();
            assertTrue(con.isValid(1000));
            
	}

}
