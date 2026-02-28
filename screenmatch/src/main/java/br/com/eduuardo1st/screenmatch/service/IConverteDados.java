package br.com.eduuardo1st.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados (String json, Class<T> classe);
}
