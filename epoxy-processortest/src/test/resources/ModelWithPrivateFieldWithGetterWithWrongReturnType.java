package com.airbnb.epoxy;

public class ModelWithPrivateFieldWithGetterWithWrongReturnType extends EpoxyModel<Object> {
  @EpoxyAttribute private int valueInt;

  @Override
  protected int getDefaultLayout() {
    return 0;
  }

  public boolean getValueInt() {
    return false;
  }

  public void setValueInt(int valueInt) {
    this.valueInt = valueInt;
  }
}