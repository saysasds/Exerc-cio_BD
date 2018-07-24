--
-- PostgreSQL database dump
--

-- Dumped from database version 10.4 (Ubuntu 10.4-0ubuntu0.18.04)
-- Dumped by pg_dump version 10.4 (Ubuntu 10.4-0ubuntu0.18.04)

-- Started on 2018-07-23 22:16:14 -03

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 13043)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2957 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 196 (class 1259 OID 16387)
-- Name: cliente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cliente (
    cd_cliente integer NOT NULL,
    endereco_cd_endereco integer,
    nm_razaosocial character varying(100),
    nm_fantasia character varying(25),
    ds_email character varying(20),
    cod_identificacao integer,
    tipo_cliente character varying(60),
    tp_visivel character(1)
);


ALTER TABLE public.cliente OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 16390)
-- Name: endereco; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.endereco (
    cd_endereco integer NOT NULL,
    nm_rua character varying(25),
    nr_casa numeric(10,0),
    ds_complemento text,
    nm_bairro character varying(25),
    nm_cidade character varying(25),
    ds_cep character(8),
    telefone1 numeric(13,0),
    telefone2 numeric(13,0)
);


ALTER TABLE public.endereco OWNER TO postgres;

--
-- TOC entry 198 (class 1259 OID 16396)
-- Name: funcao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.funcao (
    cd_funcao integer NOT NULL,
    ds_funcao text,
    tp_visivel character(1)
);


ALTER TABLE public.funcao OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 16402)
-- Name: funcionario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.funcionario (
    cd_funcionario integer NOT NULL,
    funcao_cd_funcao integer,
    endereco_cd_endereco integer,
    nm_funcionario character varying(100),
    ds_senha character varying(20),
    nick character varying(30),
    tp_invisivel character(1)
);


ALTER TABLE public.funcionario OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 16405)
-- Name: ordem_servico; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.ordem_servico (
    cd_ordem_servico integer NOT NULL,
    funcionario_cd_funcionario integer NOT NULL,
    cliente_cd_cliente integer,
    dt_ordem_servico date,
    vl_total numeric(100,2),
    bool_fechado boolean
);


ALTER TABLE public.ordem_servico OWNER TO postgres;

--
-- TOC entry 2945 (class 0 OID 16387)
-- Dependencies: 196
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cliente (cd_cliente, endereco_cd_endereco, nm_razaosocial, nm_fantasia, ds_email, cod_identificacao, tipo_cliente, tp_visivel) FROM stdin;
\.


--
-- TOC entry 2946 (class 0 OID 16390)
-- Dependencies: 197
-- Data for Name: endereco; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.endereco (cd_endereco, nm_rua, nr_casa, ds_complemento, nm_bairro, nm_cidade, ds_cep, telefone1, telefone2) FROM stdin;
\.


--
-- TOC entry 2947 (class 0 OID 16396)
-- Dependencies: 198
-- Data for Name: funcao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.funcao (cd_funcao, ds_funcao, tp_visivel) FROM stdin;
\.


--
-- TOC entry 2948 (class 0 OID 16402)
-- Dependencies: 199
-- Data for Name: funcionario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.funcionario (cd_funcionario, funcao_cd_funcao, endereco_cd_endereco, nm_funcionario, ds_senha, nick, tp_invisivel) FROM stdin;
\.


--
-- TOC entry 2949 (class 0 OID 16405)
-- Dependencies: 200
-- Data for Name: ordem_servico; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.ordem_servico (cd_ordem_servico, funcionario_cd_funcionario, cliente_cd_cliente, dt_ordem_servico, vl_total, bool_fechado) FROM stdin;
\.


--
-- TOC entry 2806 (class 2606 OID 16418)
-- Name: cliente pk_cliente; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT pk_cliente PRIMARY KEY (cd_cliente);


--
-- TOC entry 2808 (class 2606 OID 16420)
-- Name: endereco pk_endereco; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.endereco
    ADD CONSTRAINT pk_endereco PRIMARY KEY (cd_endereco);


--
-- TOC entry 2810 (class 2606 OID 16422)
-- Name: funcao pk_funcao; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcao
    ADD CONSTRAINT pk_funcao PRIMARY KEY (cd_funcao);


--
-- TOC entry 2814 (class 2606 OID 16424)
-- Name: funcionario pk_funcionario; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT pk_funcionario PRIMARY KEY (cd_funcionario);


--
-- TOC entry 2818 (class 2606 OID 16426)
-- Name: ordem_servico pk_ordem_servico; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ordem_servico
    ADD CONSTRAINT pk_ordem_servico PRIMARY KEY (cd_ordem_servico, funcionario_cd_funcionario);


--
-- TOC entry 2815 (class 1259 OID 16496)
-- Name: fki_cliente_ordem-_servico; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "fki_cliente_ordem-_servico" ON public.ordem_servico USING btree (cliente_cd_cliente);


--
-- TOC entry 2811 (class 1259 OID 16427)
-- Name: fki_endereco_funcionario; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_endereco_funcionario ON public.funcionario USING btree (endereco_cd_endereco);


--
-- TOC entry 2804 (class 1259 OID 16428)
-- Name: fki_endereço_cliente; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX "fki_endereço_cliente" ON public.cliente USING btree (endereco_cd_endereco);


--
-- TOC entry 2812 (class 1259 OID 16429)
-- Name: fki_funcao; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_funcao ON public.funcionario USING btree (funcao_cd_funcao);


--
-- TOC entry 2816 (class 1259 OID 16430)
-- Name: fki_funcionario_ordem_de_servico; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fki_funcionario_ordem_de_servico ON public.ordem_servico USING btree (funcionario_cd_funcionario);


--
-- TOC entry 2823 (class 2606 OID 16497)
-- Name: ordem_servico fk_cliente_ordem_servico; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ordem_servico
    ADD CONSTRAINT fk_cliente_ordem_servico FOREIGN KEY (cliente_cd_cliente) REFERENCES public.cliente(cd_cliente);


--
-- TOC entry 2819 (class 2606 OID 16502)
-- Name: cliente fk_endereco_cliente; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT fk_endereco_cliente FOREIGN KEY (endereco_cd_endereco) REFERENCES public.endereco(cd_endereco);


--
-- TOC entry 2820 (class 2606 OID 16431)
-- Name: funcionario fk_endereco_funcionario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT fk_endereco_funcionario FOREIGN KEY (endereco_cd_endereco) REFERENCES public.endereco(cd_endereco);


--
-- TOC entry 2821 (class 2606 OID 16441)
-- Name: funcionario fk_funcao_funcionario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT fk_funcao_funcionario FOREIGN KEY (funcao_cd_funcao) REFERENCES public.funcao(cd_funcao);


--
-- TOC entry 2822 (class 2606 OID 16446)
-- Name: ordem_servico fk_funcionario_ordem_de_servico; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ordem_servico
    ADD CONSTRAINT fk_funcionario_ordem_de_servico FOREIGN KEY (funcionario_cd_funcionario) REFERENCES public.funcionario(cd_funcionario);


-- Completed on 2018-07-23 22:16:14 -03

--
-- PostgreSQL database dump complete
--

