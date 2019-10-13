package gwt.material.demo.errai.client.page.addins.table.factory;

import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.data.HasCategories;
import gwt.material.design.client.data.component.CategoryComponent;
import gwt.material.design.client.ui.table.TableSubHeader;

public class CustomCategoryComponent extends CategoryComponent {
    public CustomCategoryComponent(HasCategories hascategories, String category) {
        super(hascategories, category);
    }

    @Override
    protected void render(TableSubHeader subheader, int columnCount) {
        super.render(subheader, columnCount);

        subheader.setOpenIcon(IconType.FOLDER_OPEN);
        subheader.setCloseIcon(IconType.FOLDER);
    }
}