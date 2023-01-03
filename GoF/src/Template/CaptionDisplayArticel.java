package Template;

import java.util.ArrayList;

public class CaptionDisplayArticel extends DisplayArticleTemplate{

	public CaptionDisplayArticel(Article article) {
		super(article);
	}

	@Override
	protected void title() {
		System.out.println("TITLE : " + article.getTitle());
	}

	@Override
	protected void content() {

		System.out.println("CONTENT : ");
		ArrayList<String> content = article.getContent();
		int cntLines = content.size();
		for(int i=0; i<cntLines; i++) {
			System.out.println("    " + content.get(i));
		}
	}

	@Override
	protected void footer() {
		System.out.println("FOOTER : " + article.getFooter());
	}

}
