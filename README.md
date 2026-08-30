# Lógica e Programação — Material de Estudo

Repositório da nossa turma. Aqui ficam os slides das aulas, os exercícios, os gabaritos e tudo que você precisar para praticar entre um encontro e outro.

Não é preciso saber programar para usar este repositório. Se você chegou aqui na primeira aula e nunca usou Git, vá direto para [Comece por aqui](#comece-por-aqui).

---

## O que tem aqui

| Pasta | O que você encontra |
|---|---|
| `aulas/` | Uma pasta por encontro: slides, material de apoio e os exercícios daquele dia |
| `exercicios/` | Exercícios extras, organizados por tema e por nível |
| `entregas/` | Onde você guarda as suas resoluções — uma pasta por pessoa |
| `gabaritos/` | Resoluções comentadas, publicadas **depois** que o prazo do exercício passa |
| `recursos/` | Links, livros, cheat sheets e ferramentas recomendadas |

```
.
├── aulas/
│   └── 01-fundamentos-algoritmos/
│       ├── README.md            ← resumo da aula e o que praticar
│       ├── slides.pdf
│       ├── roteiro.pdf
│       └── exercicios/
├── exercicios/
│   ├── 01-logica-sequencial/
│   ├── 02-condicionais/
│   └── 03-repeticao/
├── entregas/
│   └── seu-usuario/
├── gabaritos/
├── recursos/
└── README.md
```

---

## Comece por aqui

Se você nunca usou Git, faça isso uma vez e nunca mais precisa repetir.

**1. Instale o Git**
[git-scm.com/downloads](https://git-scm.com/downloads) — pode aceitar todas as opções padrão do instalador.

**2. Diga ao Git quem você é**

```bash
git config --global user.name "Seu Nome"
git config --global user.email "seu@email.com"
```

**3. Baixe o repositório para o seu computador**

```bash
git clone <URL-DO-REPOSITORIO>
cd <nome-da-pasta>
```

**4. Antes de cada sessão de estudo, puxe as novidades**

```bash
git pull
```

É isso. Se travar em qualquer passo, abra uma [issue](#duvidas-e-travadas) — travar no Git é normal e não é motivo para desistir.

> Prefere não usar a linha de comando agora? Sem problema. Você pode baixar tudo pelo botão verde **Code → Download ZIP** e voltar para o Git quando estiver mais confortável. O importante é praticar programação, não brigar com ferramenta.

---

## Como entregar um exercício

Cada pessoa tem uma pasta própria dentro de `entregas/`. Você mexe só na sua — assim ninguém sobrescreve o trabalho de ninguém.

**Passo a passo:**

```bash
# 1. Garanta que você está atualizado
git pull

# 2. Crie um branch para o seu trabalho
git checkout -b entrega/seu-usuario/aula-01

# 3. Trabalhe dentro da sua pasta
#    entregas/seu-usuario/aula-01/media-estagiario.txt

# 4. Salve e envie
git add .
git commit -m "aula 01: algoritmo da média do estagiário"
git push -u origin entrega/seu-usuario/aula-01
```

Depois é só abrir um **Pull Request** no GitHub. Eu reviso, comento e a gente conversa ali mesmo.

**Convenções:**

- Nome de pasta e arquivo: tudo minúsculo, sem espaço e sem acento — use hífen. `media-estagiario.txt`, não `Média Estagiário.txt`
- Um arquivo por exercício
- Pseudocódigo e fluxogramas podem ser `.txt`, `.md`, foto do papel ou print do Excalidraw. Todos valem
- Commit em português, no imperativo, dizendo o que foi feito

---

## As regras que valem mais que qualquer código

**1. Entregue errado em vez de não entregar.**
Um algoritmo que não funciona me mostra exatamente onde está o buraco no seu raciocínio. Uma entrega em branco não mostra nada. Revisar código errado é literalmente o trabalho.

**2. Não olhe o gabarito antes de tentar.**
Ler a resposta pronta gera a sensação de ter aprendido sem o aprendizado. Trave por 20 minutos de verdade primeiro — o travamento é onde a coisa acontece.

**3. Faça o teste de mesa antes de perguntar.**
Simule o seu algoritmo no papel, linha por linha, anotando o valor de cada variável. Metade das dúvidas se resolve sozinha nesse processo, e a outra metade vira uma pergunta muito melhor.

**4. IA é ferramenta de estudo, não de entrega.**
Usar para explicar um conceito que você não entendeu: ótimo. Colar a resposta pronta: você está pagando com o seu próprio aprendizado por uma nota que ninguém está dando. Se usou, diga no PR o que usou e para quê.

---

## Dúvidas e travadas

Use as **Issues** do repositório. É melhor que o chat do Discord porque a resposta fica registrada e serve para quem travar no mesmo ponto depois.

Ao abrir uma issue, inclua:

- **O que você está tentando fazer** — qual exercício, qual passo
- **O que você tentou** — cole o seu pseudocódigo ou o print do fluxograma
- **O que aconteceu** — onde exatamente travou, ou qual resultado saiu diferente do esperado

Uma pergunta com essas três partes costuma ser respondida em minutos. Um "não consegui, me ajuda" costuma virar três mensagens de ida e volta antes de chegar no mesmo lugar.

---

## Recursos

**Para praticar exercícios com correção automática**
- [Beecrowd](https://judge.beecrowd.com/) — centenas de problemas do nível iniciante ao avançado
- [Exercism](https://exercism.org/) — trilhas guiadas com mentoria, em várias linguagens

**Para desenhar fluxogramas**
- [Excalidraw](https://excalidraw.com/) — rápido, sem cadastro, bom para rascunho
- [draw.io](https://app.diagrams.net/) — mais completo, tem os símbolos de fluxograma prontos

**Para rodar pseudocódigo de verdade**
- [Portugol Studio](http://lite.acad.univali.br/portugol/) — pseudocódigo em português que executa e mostra os erros

**Leitura**
- *Algoritmos: Lógica para Desenvolvimento de Programação* — Manzano & Oliveira
- *Código Limpo* — Robert C. Martin (capítulo 2, sobre nomes, vale desde o primeiro dia)

Encontrou algo bom? Manda um PR adicionando aqui em `recursos/`. O repositório é da turma, não meu.
