SRC = src
TEXSRC = texsrc
DOTSRC = dotsrc
DOTPDF = dotpdf

SCALA_TEX := $(patsubst $(SRC)/%.scala,$(TEXSRC)/%.scala.tex,$(wildcard $(SRC)/*.scala))
DOT_PDF := $(patsubst $(DOTSRC)/%.dot,$(DOTPDF)/%.pdf,$(wildcard $(DOTSRC)/*.dot))

all: intermediate_scala.pdf force

intermediate_scala.pdf: intermediate_scala.tex $(SCALA_TEX) $(DOT_PDF) force
	xelatex $<

$(TEXSRC)/%.scala.tex: $(SRC)/%.scala force
	highlight -d texsrc -P -O latex -f -s edit-anjuta -k tt -S Scala -i $< -c scala.sty

$(DOTPDF)/%.pdf: $(DOTSRC)/%.dot force
	dot -Tpdf -o $@ $<

clean:
	-rm -f *.pdf *.ps *.bbl *.log *.aux *.toc *.out *.blg *.snm *.nav *~ $(TEXSRC)/* $(DOTPDF)/*

mostly-clean:
	-rm -f *.ps *.bbl *.log *.aux *.toc *.out *.blg *.snm *.nav *~ $(TEXSRC)/* $(DOTPDF)/*

.PHONY: force
