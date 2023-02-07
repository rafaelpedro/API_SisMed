package med.sis.api.medico;

import jakarta.validation.constraints.NotNull;
import med.sis.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
