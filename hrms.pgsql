--
-- PostgreSQL database dump
--

-- Dumped from database version 13.2
-- Dumped by pg_dump version 13.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: candidate_education_status; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.candidate_education_status (
    id integer NOT NULL,
    department_name character varying(255),
    graduation_year integer,
    school_name character varying(255),
    start_year integer,
    candidate_id integer,
    cv_id integer
);


ALTER TABLE public.candidate_education_status OWNER TO postgres;

--
-- Name: candidate_education_status_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.candidate_education_status_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.candidate_education_status_id_seq OWNER TO postgres;

--
-- Name: candidate_education_status_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.candidate_education_status_id_seq OWNED BY public.candidate_education_status.id;


--
-- Name: candidate_experiance; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.candidate_experiance (
    id integer NOT NULL,
    leave_year integer,
    "position" character varying(255),
    start_year integer,
    workplace_name character varying(255),
    candidate_id integer,
    cv_id integer
);


ALTER TABLE public.candidate_experiance OWNER TO postgres;

--
-- Name: candidate_experiance_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.candidate_experiance_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.candidate_experiance_id_seq OWNER TO postgres;

--
-- Name: candidate_experiance_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.candidate_experiance_id_seq OWNED BY public.candidate_experiance.id;


--
-- Name: candidate_image; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.candidate_image (
    image_id integer NOT NULL,
    image_cloudinary_id character varying(255),
    image_name character varying(255),
    image_url character varying(255),
    candidate_id integer,
    cv_id integer
);


ALTER TABLE public.candidate_image OWNER TO postgres;

--
-- Name: candidate_image_image_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.candidate_image_image_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.candidate_image_image_id_seq OWNER TO postgres;

--
-- Name: candidate_image_image_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.candidate_image_image_id_seq OWNED BY public.candidate_image.image_id;


--
-- Name: candidate_language; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.candidate_language (
    id integer NOT NULL,
    language character varying(255),
    level integer,
    candidate_id integer,
    cv_id integer
);


ALTER TABLE public.candidate_language OWNER TO postgres;

--
-- Name: candidate_language_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.candidate_language_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.candidate_language_id_seq OWNER TO postgres;

--
-- Name: candidate_language_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.candidate_language_id_seq OWNED BY public.candidate_language.id;


--
-- Name: candidate_links; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.candidate_links (
    id integer NOT NULL,
    github_link character varying(255),
    linkedin_link character varying(255),
    candidate_id integer,
    cv_id integer
);


ALTER TABLE public.candidate_links OWNER TO postgres;

--
-- Name: candidate_links_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.candidate_links_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.candidate_links_id_seq OWNER TO postgres;

--
-- Name: candidate_links_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.candidate_links_id_seq OWNED BY public.candidate_links.id;


--
-- Name: candidate_skills; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.candidate_skills (
    id integer NOT NULL,
    programming_language character varying(255),
    technologies character varying(255),
    candidate_id integer,
    cv_id integer
);


ALTER TABLE public.candidate_skills OWNER TO postgres;

--
-- Name: candidate_skills_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.candidate_skills_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.candidate_skills_id_seq OWNER TO postgres;

--
-- Name: candidate_skills_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.candidate_skills_id_seq OWNED BY public.candidate_skills.id;


--
-- Name: candidates; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.candidates (
    id integer NOT NULL,
    first_name character varying(35) NOT NULL,
    last_name character varying(35) NOT NULL,
    birth_date date NOT NULL,
    national_identity character varying(255),
    email_address character varying(255),
    password character varying(255),
    cv_id integer
);


ALTER TABLE public.candidates OWNER TO postgres;

--
-- Name: cities; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cities (
    id integer NOT NULL,
    city_name character varying(255)
);


ALTER TABLE public.cities OWNER TO postgres;

--
-- Name: cities_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cities_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cities_id_seq OWNER TO postgres;

--
-- Name: cities_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cities_id_seq OWNED BY public.cities.id;


--
-- Name: cover_letter; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cover_letter (
    id integer NOT NULL,
    cover_letter character varying(255),
    candidate_id integer,
    cv_id integer
);


ALTER TABLE public.cover_letter OWNER TO postgres;

--
-- Name: cover_letter_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cover_letter_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cover_letter_id_seq OWNER TO postgres;

--
-- Name: cover_letter_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cover_letter_id_seq OWNED BY public.cover_letter.id;


--
-- Name: cv; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cv (
    id integer NOT NULL,
    candidate_id integer
);


ALTER TABLE public.cv OWNER TO postgres;

--
-- Name: cv_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.cv_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.cv_id_seq OWNER TO postgres;

--
-- Name: cv_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.cv_id_seq OWNED BY public.cv.id;


--
-- Name: employee_confirms; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employee_confirms (
    id integer NOT NULL,
    employee_id integer NOT NULL,
    is_confirmed boolean NOT NULL
);


ALTER TABLE public.employee_confirms OWNER TO postgres;

--
-- Name: employee_confirms_employers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employee_confirms_employers (
    id integer NOT NULL,
    employer_id integer NOT NULL
);


ALTER TABLE public.employee_confirms_employers OWNER TO postgres;

--
-- Name: employee_confirms_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.employee_confirms ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.employee_confirms_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: employees; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employees (
    id integer NOT NULL,
    first_name character varying(35) NOT NULL,
    last_name character varying(35) NOT NULL
);


ALTER TABLE public.employees OWNER TO postgres;

--
-- Name: employers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employers (
    id integer NOT NULL,
    company_name character varying(255) NOT NULL,
    web_address character varying(255) NOT NULL,
    phone_number character varying(12) NOT NULL,
    email_address character varying(255),
    password character varying(255)
);


ALTER TABLE public.employers OWNER TO postgres;

--
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

--
-- Name: job_advertisement; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.job_advertisement (
    id integer NOT NULL,
    deadline_date timestamp without time zone,
    is_active boolean,
    job_description character varying(255),
    listing_date timestamp without time zone,
    max_salary double precision,
    min_salary double precision,
    number_of_open_position integer,
    city_id integer,
    employer_id integer,
    position_id integer
);


ALTER TABLE public.job_advertisement OWNER TO postgres;

--
-- Name: job_advertisement_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.job_advertisement_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.job_advertisement_id_seq OWNER TO postgres;

--
-- Name: job_advertisement_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.job_advertisement_id_seq OWNED BY public.job_advertisement.id;


--
-- Name: job_positions; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.job_positions (
    id integer NOT NULL,
    title character varying(255)
);


ALTER TABLE public.job_positions OWNER TO postgres;

--
-- Name: job_positions_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.job_positions ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.job_positions_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: jobs; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.jobs (
    id integer NOT NULL,
    job text
);


ALTER TABLE public.jobs OWNER TO postgres;

--
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    id integer NOT NULL,
    email_address character varying(320) NOT NULL,
    password character varying(25) NOT NULL
);


ALTER TABLE public.users OWNER TO postgres;

--
-- Name: users_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.users ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: verification_codes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.verification_codes (
    id integer NOT NULL,
    code character varying(38) NOT NULL,
    is_verified boolean NOT NULL
);


ALTER TABLE public.verification_codes OWNER TO postgres;

--
-- Name: verification_codes_candidates; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.verification_codes_candidates (
    id integer NOT NULL,
    candidate_id integer NOT NULL
);


ALTER TABLE public.verification_codes_candidates OWNER TO postgres;

--
-- Name: verification_codes_employers; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.verification_codes_employers (
    id integer NOT NULL,
    employer_id integer NOT NULL
);


ALTER TABLE public.verification_codes_employers OWNER TO postgres;

--
-- Name: verification_codes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.verification_codes ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.verification_codes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: candidate_education_status id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_education_status ALTER COLUMN id SET DEFAULT nextval('public.candidate_education_status_id_seq'::regclass);


--
-- Name: candidate_experiance id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_experiance ALTER COLUMN id SET DEFAULT nextval('public.candidate_experiance_id_seq'::regclass);


--
-- Name: candidate_image image_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_image ALTER COLUMN image_id SET DEFAULT nextval('public.candidate_image_image_id_seq'::regclass);


--
-- Name: candidate_language id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_language ALTER COLUMN id SET DEFAULT nextval('public.candidate_language_id_seq'::regclass);


--
-- Name: candidate_links id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_links ALTER COLUMN id SET DEFAULT nextval('public.candidate_links_id_seq'::regclass);


--
-- Name: candidate_skills id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_skills ALTER COLUMN id SET DEFAULT nextval('public.candidate_skills_id_seq'::regclass);


--
-- Name: cities id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cities ALTER COLUMN id SET DEFAULT nextval('public.cities_id_seq'::regclass);


--
-- Name: cover_letter id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cover_letter ALTER COLUMN id SET DEFAULT nextval('public.cover_letter_id_seq'::regclass);


--
-- Name: cv id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cv ALTER COLUMN id SET DEFAULT nextval('public.cv_id_seq'::regclass);


--
-- Name: job_advertisement id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_advertisement ALTER COLUMN id SET DEFAULT nextval('public.job_advertisement_id_seq'::regclass);


--
-- Data for Name: candidate_education_status; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.candidate_education_status (id, department_name, graduation_year, school_name, start_year, candidate_id, cv_id) FROM stdin;
3	string	0	string	0	1	\N
\.


--
-- Data for Name: candidate_experiance; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.candidate_experiance (id, leave_year, "position", start_year, workplace_name, candidate_id, cv_id) FROM stdin;
11	2	string	1	string	1	\N
14	10	string	0	string	2	\N
\.


--
-- Data for Name: candidate_image; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.candidate_image (image_id, image_cloudinary_id, image_name, image_url, candidate_id, cv_id) FROM stdin;
\.


--
-- Data for Name: candidate_language; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.candidate_language (id, language, level, candidate_id, cv_id) FROM stdin;
1	ingilizce	3	1	\N
\.


--
-- Data for Name: candidate_links; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.candidate_links (id, github_link, linkedin_link, candidate_id, cv_id) FROM stdin;
1	github.com	linkedin.com	1	\N
\.


--
-- Data for Name: candidate_skills; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.candidate_skills (id, programming_language, technologies, candidate_id, cv_id) FROM stdin;
1	java	react	1	\N
\.


--
-- Data for Name: candidates; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.candidates (id, first_name, last_name, birth_date, national_identity, email_address, password, cv_id) FROM stdin;
1	hazar	bey	2021-05-28	12314214	\N	\N	\N
2	string	string	2021-06-02	string	\N	\N	\N
\.


--
-- Data for Name: cities; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cities (id, city_name) FROM stdin;
\.


--
-- Data for Name: cover_letter; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cover_letter (id, cover_letter, candidate_id, cv_id) FROM stdin;
\.


--
-- Data for Name: cv; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.cv (id, candidate_id) FROM stdin;
2	1
3	1
\.


--
-- Data for Name: employee_confirms; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employee_confirms (id, employee_id, is_confirmed) FROM stdin;
\.


--
-- Data for Name: employee_confirms_employers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employee_confirms_employers (id, employer_id) FROM stdin;
\.


--
-- Data for Name: employees; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employees (id, first_name, last_name) FROM stdin;
\.


--
-- Data for Name: employers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employers (id, company_name, web_address, phone_number, email_address, password) FROM stdin;
\.


--
-- Data for Name: job_advertisement; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.job_advertisement (id, deadline_date, is_active, job_description, listing_date, max_salary, min_salary, number_of_open_position, city_id, employer_id, position_id) FROM stdin;
\.


--
-- Data for Name: job_positions; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.job_positions (id, title) FROM stdin;
1	engineer
\.


--
-- Data for Name: jobs; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.jobs (id, job) FROM stdin;
1	doctor
2	engineer
3	teacher
4	chef
\.


--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users (id, email_address, password) FROM stdin;
1	hazar@gmail.com	1221421
2	string@gmail.com	string
\.


--
-- Data for Name: verification_codes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.verification_codes (id, code, is_verified) FROM stdin;
\.


--
-- Data for Name: verification_codes_candidates; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.verification_codes_candidates (id, candidate_id) FROM stdin;
\.


--
-- Data for Name: verification_codes_employers; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.verification_codes_employers (id, employer_id) FROM stdin;
\.


--
-- Name: candidate_education_status_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.candidate_education_status_id_seq', 4, true);


--
-- Name: candidate_experiance_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.candidate_experiance_id_seq', 14, true);


--
-- Name: candidate_image_image_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.candidate_image_image_id_seq', 1, false);


--
-- Name: candidate_language_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.candidate_language_id_seq', 1, true);


--
-- Name: candidate_links_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.candidate_links_id_seq', 1, true);


--
-- Name: candidate_skills_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.candidate_skills_id_seq', 1, true);


--
-- Name: cities_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cities_id_seq', 1, false);


--
-- Name: cover_letter_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cover_letter_id_seq', 1, false);


--
-- Name: cv_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cv_id_seq', 3, true);


--
-- Name: employee_confirms_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.employee_confirms_id_seq', 1, false);


--
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.hibernate_sequence', 1, false);


--
-- Name: job_advertisement_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.job_advertisement_id_seq', 1, true);


--
-- Name: job_positions_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.job_positions_id_seq', 1, true);


--
-- Name: users_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.users_id_seq', 2, true);


--
-- Name: verification_codes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.verification_codes_id_seq', 1, false);


--
-- Name: candidate_education_status candidate_education_status_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_education_status
    ADD CONSTRAINT candidate_education_status_pkey PRIMARY KEY (id);


--
-- Name: candidate_experiance candidate_experiance_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_experiance
    ADD CONSTRAINT candidate_experiance_pkey PRIMARY KEY (id);


--
-- Name: candidate_image candidate_image_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_image
    ADD CONSTRAINT candidate_image_pkey PRIMARY KEY (image_id);


--
-- Name: candidate_language candidate_language_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_language
    ADD CONSTRAINT candidate_language_pkey PRIMARY KEY (id);


--
-- Name: candidate_links candidate_links_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_links
    ADD CONSTRAINT candidate_links_pkey PRIMARY KEY (id);


--
-- Name: candidate_skills candidate_skills_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_skills
    ADD CONSTRAINT candidate_skills_pkey PRIMARY KEY (id);


--
-- Name: candidates candidates_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidates
    ADD CONSTRAINT candidates_pkey PRIMARY KEY (id);


--
-- Name: cities cities_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cities
    ADD CONSTRAINT cities_pkey PRIMARY KEY (id);


--
-- Name: cover_letter cover_letter_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cover_letter
    ADD CONSTRAINT cover_letter_pkey PRIMARY KEY (id);


--
-- Name: cv cv_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cv
    ADD CONSTRAINT cv_pkey PRIMARY KEY (id);


--
-- Name: employee_confirms_employers employee_confirms_employers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee_confirms_employers
    ADD CONSTRAINT employee_confirms_employers_pkey PRIMARY KEY (id);


--
-- Name: employee_confirms employee_confirms_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee_confirms
    ADD CONSTRAINT employee_confirms_pkey PRIMARY KEY (id);


--
-- Name: employees employees_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employees
    ADD CONSTRAINT employees_pkey PRIMARY KEY (id);


--
-- Name: employers employers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employers
    ADD CONSTRAINT employers_pkey PRIMARY KEY (id);


--
-- Name: job_advertisement job_advertisement_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_advertisement
    ADD CONSTRAINT job_advertisement_pkey PRIMARY KEY (id);


--
-- Name: job_positions job_positions_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_positions
    ADD CONSTRAINT job_positions_pkey PRIMARY KEY (id);


--
-- Name: jobs jobs_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.jobs
    ADD CONSTRAINT jobs_pkey PRIMARY KEY (id);


--
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- Name: verification_codes_candidates verification_codes_candidates_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_codes_candidates
    ADD CONSTRAINT verification_codes_candidates_pkey PRIMARY KEY (id);


--
-- Name: verification_codes_employers verification_codes_employers_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_codes_employers
    ADD CONSTRAINT verification_codes_employers_pkey PRIMARY KEY (id);


--
-- Name: verification_codes verification_codes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_codes
    ADD CONSTRAINT verification_codes_pkey PRIMARY KEY (id);


--
-- Name: candidates candidates_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidates
    ADD CONSTRAINT candidates_id_fkey FOREIGN KEY (id) REFERENCES public.users(id) NOT VALID;


--
-- Name: employee_confirms employee_confirms_employee_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee_confirms
    ADD CONSTRAINT employee_confirms_employee_id_fkey FOREIGN KEY (employee_id) REFERENCES public.employees(id) NOT VALID;


--
-- Name: employee_confirms_employers employee_confirms_employers_employer_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee_confirms_employers
    ADD CONSTRAINT employee_confirms_employers_employer_id_fkey FOREIGN KEY (employer_id) REFERENCES public.employers(id) NOT VALID;


--
-- Name: employee_confirms_employers employee_confirms_employers_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee_confirms_employers
    ADD CONSTRAINT employee_confirms_employers_id_fkey FOREIGN KEY (id) REFERENCES public.employee_confirms(id) NOT VALID;


--
-- Name: employees employees_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employees
    ADD CONSTRAINT employees_id_fkey FOREIGN KEY (id) REFERENCES public.users(id) NOT VALID;


--
-- Name: employers employers_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employers
    ADD CONSTRAINT employers_id_fkey FOREIGN KEY (id) REFERENCES public.users(id) NOT VALID;


--
-- Name: candidate_language fk2cgkvwccdjdxgjnx8l05356ip; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_language
    ADD CONSTRAINT fk2cgkvwccdjdxgjnx8l05356ip FOREIGN KEY (candidate_id) REFERENCES public.candidates(id);


--
-- Name: candidate_links fk2ms5tu9suiwsc51vx1j3x0onn; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_links
    ADD CONSTRAINT fk2ms5tu9suiwsc51vx1j3x0onn FOREIGN KEY (candidate_id) REFERENCES public.candidates(id);


--
-- Name: job_advertisement fk4hy6kja8d0shrxgmywo4c1mq1; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_advertisement
    ADD CONSTRAINT fk4hy6kja8d0shrxgmywo4c1mq1 FOREIGN KEY (city_id) REFERENCES public.cities(id);


--
-- Name: candidate_experiance fk5e8fmi467c6lr9k2uijim25in; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_experiance
    ADD CONSTRAINT fk5e8fmi467c6lr9k2uijim25in FOREIGN KEY (cv_id) REFERENCES public.cv(id);


--
-- Name: candidate_image fk6mga4ayqu6p3d7jq1sho3s98c; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_image
    ADD CONSTRAINT fk6mga4ayqu6p3d7jq1sho3s98c FOREIGN KEY (cv_id) REFERENCES public.cv(id);


--
-- Name: cover_letter fk75crlwikmh1pmaql4k6xcaw7y; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cover_letter
    ADD CONSTRAINT fk75crlwikmh1pmaql4k6xcaw7y FOREIGN KEY (cv_id) REFERENCES public.cv(id);


--
-- Name: job_advertisement fk91nm9jn6tqhc01uwosfh33q9t; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_advertisement
    ADD CONSTRAINT fk91nm9jn6tqhc01uwosfh33q9t FOREIGN KEY (position_id) REFERENCES public.job_positions(id);


--
-- Name: candidate_language fkavu19p9v7m67t7cd9qoua3e7j; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_language
    ADD CONSTRAINT fkavu19p9v7m67t7cd9qoua3e7j FOREIGN KEY (cv_id) REFERENCES public.cv(id);


--
-- Name: candidate_image fkb43gntkeyqh6t0sc6a5u2w2fp; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_image
    ADD CONSTRAINT fkb43gntkeyqh6t0sc6a5u2w2fp FOREIGN KEY (candidate_id) REFERENCES public.candidates(id);


--
-- Name: candidate_links fkf5p2lr7w5w8h7x3jcow1xraxv; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_links
    ADD CONSTRAINT fkf5p2lr7w5w8h7x3jcow1xraxv FOREIGN KEY (cv_id) REFERENCES public.cv(id);


--
-- Name: candidate_education_status fkgnrkik7xg18sg6g36qnn9etjt; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_education_status
    ADD CONSTRAINT fkgnrkik7xg18sg6g36qnn9etjt FOREIGN KEY (candidate_id) REFERENCES public.candidates(id);


--
-- Name: cover_letter fkjs24if571bqfbi5alsfdr36g; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cover_letter
    ADD CONSTRAINT fkjs24if571bqfbi5alsfdr36g FOREIGN KEY (candidate_id) REFERENCES public.candidates(id);


--
-- Name: candidate_skills fkk71gu2subkaxroroxevtc6lu6; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_skills
    ADD CONSTRAINT fkk71gu2subkaxroroxevtc6lu6 FOREIGN KEY (candidate_id) REFERENCES public.candidates(id);


--
-- Name: candidate_skills fkmblqcuhmb70dvou1o4s077wk5; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_skills
    ADD CONSTRAINT fkmblqcuhmb70dvou1o4s077wk5 FOREIGN KEY (cv_id) REFERENCES public.cv(id);


--
-- Name: candidate_experiance fknctkttrc1bjulqj0v7yr6r1mf; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_experiance
    ADD CONSTRAINT fknctkttrc1bjulqj0v7yr6r1mf FOREIGN KEY (candidate_id) REFERENCES public.candidates(id);


--
-- Name: job_advertisement fkomwppvulush1crsot9mkarjhd; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.job_advertisement
    ADD CONSTRAINT fkomwppvulush1crsot9mkarjhd FOREIGN KEY (employer_id) REFERENCES public.employers(id);


--
-- Name: cv fkqjg4636m9tpgknhpishpy6ojn; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cv
    ADD CONSTRAINT fkqjg4636m9tpgknhpishpy6ojn FOREIGN KEY (candidate_id) REFERENCES public.candidates(id);


--
-- Name: candidates fkrrb9vfr7qkpxafp5ph5nynhwq; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidates
    ADD CONSTRAINT fkrrb9vfr7qkpxafp5ph5nynhwq FOREIGN KEY (cv_id) REFERENCES public.cv(id);


--
-- Name: candidate_education_status fksdncs1ebpeb7g678ry8mqqltq; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.candidate_education_status
    ADD CONSTRAINT fksdncs1ebpeb7g678ry8mqqltq FOREIGN KEY (cv_id) REFERENCES public.cv(id);


--
-- Name: verification_codes_candidates verification_codes_candidates_candidate_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_codes_candidates
    ADD CONSTRAINT verification_codes_candidates_candidate_id_fkey FOREIGN KEY (candidate_id) REFERENCES public.candidates(id) NOT VALID;


--
-- Name: verification_codes_candidates verification_codes_candidates_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_codes_candidates
    ADD CONSTRAINT verification_codes_candidates_id_fkey FOREIGN KEY (id) REFERENCES public.verification_codes(id) NOT VALID;


--
-- Name: verification_codes_employers verification_codes_employers_employer_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_codes_employers
    ADD CONSTRAINT verification_codes_employers_employer_id_fkey FOREIGN KEY (employer_id) REFERENCES public.employers(id) NOT VALID;


--
-- Name: verification_codes_employers verification_codes_employers_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.verification_codes_employers
    ADD CONSTRAINT verification_codes_employers_id_fkey FOREIGN KEY (id) REFERENCES public.verification_codes(id) NOT VALID;


--
-- PostgreSQL database dump complete
--

