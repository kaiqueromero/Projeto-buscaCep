public record Address(String cep, String logradouro, String bairro, String localidade,
                      String uf, String ibge, String gia, String ddd, String siafi) {
    @Override
    public String toString() {
        return "\nCep: " + cep +
                "\nLogradouro: " + logradouro +
                "\nBairro: " + bairro +
                "\nLocalidade: " + localidade +
                "\nUnidade Federativa: " + uf +
                "\nIbge: " + ibge +
                "\nGia: " + gia +
                "\nddd: " + ddd +
                "\nSiafi: " + siafi;
    }
}
