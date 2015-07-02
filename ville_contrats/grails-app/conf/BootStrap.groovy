import ville_contrats.*
import grails.converters.JSON
import groovy.json.*
import org.codehaus.groovy.grails.commons.*

class BootStrap {
	
    def init = { servletContext ->
		/*
		new Contrat(ids:'1', nomfour:'106979 CANADA LTEE', numero:'667608', dateapbt:'02/09/2011', approbateur:'CHOQUET, JEAN-ROBERT', description:'RESTAURATION DE L\'OEUVRE D\'ART INTEGREE A L\'ARCHITECTURE DE LA BIBLIOTHEQUE LE PREVOST', service:'SERVICE DE LA QUALITE DE VIE', activite:'BIENS PATRIMONIAUX', montant:'39757,63', pcharge:'*').save(flush:true)
		new Contrat(ids:'2', nomfour:'113921 CANADA INC.', numero:'LOYERJANVIER2013', dateapbt:'01/01/2013', approbateur:'FERLAND, ANNE-MARIE', description:'JANVIER 2013 - LOYER - 1805, FLEURY', service:'FACTURATION PERIODIQUE A REPARTIR', activite:'BAUX', montant:'10185,14', pcharge:'*').save(flush:true)
		new Contrat(ids:'3', nomfour:'113921 CANADA INC.', numero:'LOYERMAI2013', dateapbt:'01/05/2013', approbateur:'FERLAND, ANNE-MARIE', description:'MAI 2013 - LOYER - 1805, FLEURY', service:'FACTURATION PERIODIQUE A REPARTIR', activite:'BAUX', montant:'10185,14', pcharge:'*').save(flush:true)
		new Contrat(ids:'4', nomfour:'113921 CANADA INC.', numero:'LOYERJUILLET2013', dateapbt:'02/07/2013', approbateur:'FERLAND, ANNE-MARIE', description:'JUILLET 2013 - LOYER - 1805, FLEURY', service:'FACTURATION PERIODIQUE A REPARTIR', activite:'BAUX', montant:'10185,14', pcharge:'*').save(flush:true)
		new Contrat(ids:'5', nomfour:'113921 CANADA INC.', numero:'LOYERJUIN2013', dateapbt:'01/06/2013', approbateur:'FERLAND, ANNE-MARIE', description:'JUIN 2013 - LOYER - 1805, FLEURY', service:'FACTURATION PERIODIQUE A REPARTIR', activite:'BAUX', montant:'10185,14', pcharge:'*').save(flush:true)
		new Contrat(ids:'6', nomfour:'113921 CANADA INC.', numero:'LOYERAOUT2013', dateapbt:'01/08/2013', approbateur:'FERLAND, ANNE-MARIE', description:'AOUT 2013 -LOYER - 1805, FLEURY', service:'FACTURATION PERIODIQUE A REPARTIR', activite:'LOYER', montant:'10185,14', pcharge:'*').save(flush:true)
		new Contrat(ids:'7', nomfour:'113921 CANADA INC.', numero:'LOYERFEVRIER2013', dateapbt:'01/02/2013', approbateur:'FERLAND, ANNE-MARIE', description:'FEVRIER 2013 - LOYER -1805, FLEURY', service:'SERVICE DE CONCERTATION DES ARRONDISSEMENTS ET DES RESSOURCES MATERIELLES', activite:'FACTURATION PERIODIQUE A REPARTIR', montant:'10185,14', pcharge:'*').save(flush:true)
		new Contrat(ids:'8', nomfour:'119104 CANADA LIMITEE', numero:'LOYERJUIN2013', dateapbt:'01/01/2013', approbateur:'FERLAND, ANNE-MARIE', description:'JANVIER 2013 - LOYER - 8695, HOCHELAGA', service:'FACTURATION PERIODIQUE A REPARTIR', activite:'BAUX', montant:'9486,78', pcharge:'*').save(flush:true)
		new Contrat(ids:'9', nomfour:'142975 CANADA LTEE/ MIRONOR', numero:'902678', dateapbt:'01/01/2013', approbateur:'MARCOTTE, ANNE-MARIE', description:'SERVICE DES INFRASTRUCTURES, DU TRANSPORT ET DE L\'ENVIRONNEMENT', service:'MATIERES RECYCLABLES - MATIERES ORGANIQUES - TRAITEMENT', activite:'ADMINISTRATION, FINANCES ET APPROVISIONNEMENT', montant:'3000', pcharge:'*').save(flush:true)
		new Contrat(ids:'10', nomfour:'1-800-GOT-JUNK', numero:'734569', dateapbt:'20/03/2012', approbateur:'MARCOTTE, ANNE-MARIE', description:'RECUPERATION - REAMENAGEMENTT 9515 ST-HUBERT', service:'SERVICE DE CONCERTATION DES ARRONDISSEMENTS ET DES RESSOURCES MATERIELLES', activite:'ADMINISTRATION, FINANCES ET APPROVISIONNEMENT', montant:'2639,41', pcharge:'*').save(flush:true)
		new Contrat(ids:'11', nomfour:'24 HEURES MONTREAL METROPOLITAIN', numero:'730589', dateapbt:'26/03/2012', approbateur:'SPANDONIDE, CAROLINE', description:'CAMPAGNE CREATIVITE - BONNE NOUVELLE - 15 PLACEMENTS DANS LE JOURNAL.', service:'DIRECTION GENERALE', activite:'REL. AVEC LES CITOYENS ET COMMUNICATIONS', montant:'22269,94', pcharge:'*').save(flush:true)
		*/
		
		
		def inputFile = new File("C:/ggts-bundle/Repository/ville_contrats/grails-app/migrations/source1.json")
		def InputJSON = new JsonSlurper().parseText(inputFile.text)
		InputJSON.each{ println it }
		InputJSON.each{
			new Contrat(it).save(flush:true)
		}
				
    }
    def destroy = {
    }
}
