package metier;
import java.time.LocalDate;

public class Facture

{
	LocalDate date;
	private Client client;
	private int montant;
	
	public Facture(Client client, int montant) {
		this.client = client;
		this.montant = montant;
	}


	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	
	public Client getClient()
	{
		return client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return false;
	}
	
	public void SetDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		client = null;
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return null;
	}
}